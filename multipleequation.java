import java.util.List;
import java.util.Stack;

public class multipleequation {
	public static List<String> convertingFormat(String input) {
		int priority = 0;
		String prefixBefore = "";
		Stack<Character> stack = new Stack<Character>();
		List<String> afterfixArray = new ArrayList<String>();
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				
				if (prefixBefore.length() > 0) {
					afterfixArray.add(prefixBefore);
				}
				prefixBefore = "";
				if (stack.size() <= 0)
					stack.push(ch);
				else {
					Character chTop = (Character) stack.peek();
					if (chTop == '*' || ch == '-')
						priority = 1;
					else 
						priority = 0;
					if (priority == 1) {
						if (ch == '+' || ch == '-') {
							afterfixArray.add(String.valueOf(stack.pop()));
							i--;
						} else {
							afterfixArray.add(String.valueOf(stack.pop()));
							i--;
						}
					} else {
							if (ch == '+' || ch == '-') {
								afterfixArray.add(String.valueOf(stack.pop()));
								stack.push(ch);
							} else
								stack.push(ch);
						}
					}
				} else {
				prefixBefore += ch;
				}
			}
			afterfixArray.add(prefixBefore);
			int len = stack.size();
			for (int j = 0; j < len; j++)
				afterfixArray.add(stack.pop().toString());
			return afterfixArray;
		}
	}

