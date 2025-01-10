public boolean passwordCheck(String password) {
    for (int i = 0; i < password.length(); i++) {
        char current = password.charAt(i);
        if (password.length() < 8 || !Character.isLetterOrDigit(current)) {
            return false;
        }
    }
    return true;
}