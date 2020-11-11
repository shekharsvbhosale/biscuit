class CompliantCode {
public void foo() {
	// Non compliant code
	try {

			Cipher c = Cipher.getInstance("DES"); // Or DESede, RC2, RC4 as these are known to be vulnerable*
		} 
		catch (NoSuchAlgorithmException | NoSuchPaddingException e) {}

// Compliant code
	try {
			Cipher c = Cipher.getInstance("AES/GCM/NoPadding"); // Compliant
		}	 
		catch(NoSuchAlgorithmException|NoSuchPaddingException e) {}
	}
}