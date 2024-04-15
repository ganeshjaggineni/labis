package islabexternal;

class DiffieHellman {
    public static void main(String args[]) {
        int p = 47; /* publicly known (prime number) */
        int g = 5; /* publicly known (primitive root) */
        int aliceSecret = 18; /* only Alice knows this secret */
        int bobSecret = 22; /* only Bob knows this secret */

        double aliceSends = (Math.pow(g, aliceSecret)) % p;
        double bobSends = (Math.pow(g, bobSecret)) % p;
        double aliceComputes = (Math.pow(bobSends, aliceSecret)) % p;
        double bobComputes = (Math.pow(aliceSends, bobSecret)) % p;

        System.out.println("Simulation of Diffie-Hellman key exchange algorithm\n------------------------------------");
        System.out.println("Alice Sends : " + aliceSends);
        System.out.println("Bob Sends : " + bobSends);
        System.out.println("Alice Computes : " + aliceComputes);
        System.out.println("Bob Computes : " + bobComputes);

        if (aliceComputes == bobComputes) {
            System.out.println("Success: Shared Secrets Match! Shared Secret: " + aliceComputes);
        } else {
            System.out.println("Error: Shared Secrets Do Not Match");
        }
    }
}
