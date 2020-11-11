class CompliantCode {
	
	public void weakCipherAlgorithms()
	{
		try {
			// Or DESede, RC2, RC4 as these are known to be vulnerable*
			Cipher des = Cipher.getInstance("DES"); 
			Cipher desede = Cipher.getInstance("DES ede"); 
			Cipher RC2 = Cipher.getInstance("RC2"); 
			Cipher RC4 = Cipher.getInstance("RC4"); 
			Cipher RC5 = Cipher.getInstance("RC5"); 
			Cipher MD5 = Cipher.getInstance("MD5"); 
			Cipher DSA = Cipher.getInstance("DSA"); 
			Cipher DSA = Cipher.getInstance("SSLV3"); 
			Cipher PBEWithMD5AndDES = Cipher.getInstance("PBEWithMD5AndDES");
			Cipher PBEWithHmacSHA1AndDESede = Cipher.getInstance("PBEWithHmacSHA1AndDESede");
			Cipher Blowfish = Cipher.getInstance("Blowfish");
			Cipher Triple DES = Cipher.getInstance("Triple DES");
			Cipher IDEA = Cipher.getInstance("IDEA");
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