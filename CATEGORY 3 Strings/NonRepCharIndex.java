class NonRepCharIndex{
	
	static int nonRepChar(String str){

	
	char[] chArr= str.toCharArray();
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();

		for(int i = 0; i < chArr.length; i++){
			if(!lhm.containsKey(chArr[i])){
				lhm.put(chArr[i], 1);
			}
			else{
				lhm.put(chArr[i],lhm.get(chArr[i])+1);
			}
		}

	
		for(Map.Entry<Character,Integer> el : lhm.entrySet()){
			if(el.getValue() ==1) return str.indexOf( el.getKey()); 
	
		}

	return -1;	
	}
	

	public static void main(String[] args){
		System.out.println(NonRepChar.nonRepChar("pricceies"));
	}
}