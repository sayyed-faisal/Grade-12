public String useProperGrammar(String text) {
	
	String result = "";
	
	for (int i = 0; i < text.length(); i++) {
	    char current = text.charAt(i);
	    if (current == '2') {
	        result += "to";
	    }
	    else {
	        result += current;
	    }
	}
	
	return result;
}