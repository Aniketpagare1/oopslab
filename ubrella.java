class Check_Letter
{
	public static void main(String[] args)
	{
		String str = "umbrella";
		boolean pre = false;
		for(int i = 0;i<str.length();i++)
		{
			if(str.charAt(i) == 'e')
			{
				pre=true;
				break;
			}
		}
		System.out.println(pre);
	}
}
