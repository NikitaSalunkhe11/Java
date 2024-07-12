class Client{
	public static void main(String[] args){

		String name="Hello world";

		StringBuffer str=new StringBuffer();

		for(int i=0;i<name.length();i++){
			if(name.charAt(i) != ' '){
				str.append(name.charAt(i));
			}
		}

		System.out.println(System.identityHashCode(str));

	}
}

