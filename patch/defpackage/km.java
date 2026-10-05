// In km.g(String), accept prefix length 1 or 2.
// Original condition:
//   str.length() == 1 && !Character.isLetterOrDigit(str.charAt(0)) && !h22.P(str.charAt(0))
// New condition:
//   (str.length() == 1 || str.length() == 2)
//   && every character is non-alphanumeric and non-whitespace.
// Existing command migration remains unchanged.