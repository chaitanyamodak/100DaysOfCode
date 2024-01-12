class Solution{
	public boolean halvesAreAlike(String s){
		int vowelCount=0;
		int left=0;
		int right=s.length()-1;

		while(left<right){
			if(isVowel(s.charAt(left)){
				vowelCount++;
			}

			if(isVowel(s.charAt(right)){
				vowelCount--;
			}

			left++;
			right--;
		}

		return vowelCount==0;
	}

	private boolean isVowel(char ch){
		return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
	}
}