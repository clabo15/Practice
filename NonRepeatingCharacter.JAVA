//Given a string s consisting of small English letters, find and return the first instance of a non-repeating 
//character in it. If there is no such character, return '_'.

//Given
char firstNotRepeatingCharacter(String s) {
	//Write Code Here
	for (int i = 0; i < s.length(); i++){
        if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)) ){
            return s.charAt(i);
        }
    }
    return '_';
}
