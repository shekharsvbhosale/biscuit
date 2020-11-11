class CompliantCode {
	
	public void weakCipherAlgorithms()
	{
		try {
			// Or DESede, RC2, RC4 as these are known to be vulnerable*
			Cipher des = Cipher.getInstance("DES"); 
			Cipher desede = Cipher.getInstance("DES ede"); 
			Cipher rc2 = Cipher.getInstance("RC2"); 
			Cipher rc4 = Cipher.getInstance("RC4"); 
			Cipher rc5 = Cipher.getInstance("RC5"); 
			Cipher md5 = Cipher.getInstance("MD5"); 
			Cipher dsa = Cipher.getInstance("DSA"); 
			Cipher sslv3 = Cipher.getInstance("SSLV3"); 
			Cipher pbes = Cipher.getInstance("PBEWithMD5AndDES");
			Cipher pbede = Cipher.getInstance("PBEWithHmacSHA1AndDESede");
			Cipher blowfs = Cipher.getInstance("Blowfish");
			Cipher trippledes = Cipher.getInstance("Triple DES");
			Cipher idea = Cipher.getInstance("IDEA");
		} 
		catch (NoSuchAlgorithmException | NoSuchPaddingException e) {}
	}
	
	public void CompliantCipherAlgorithms()
	{
		try {
			// Compliant
			Cipher c = Cipher.getInstance("AES/GCM/NoPadding"); 
		} 
		catch (NoSuchAlgorithmException | NoSuchPaddingException e) {}
	}
}