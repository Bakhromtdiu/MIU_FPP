public class Prog2 {
    public static void main(String[] args) {
        // Column names: productId, name, numInStock, provider, pricePerUnit
        String records = "231A,Light Bulb,123,Wilco,1.75:" +
                "113D,Hairbrush,19,Aamco,3.75:" +
                "521W,Shampoo,24,Acme,6.95:" +
                "440Q,Dishwashing Detergent,20,Wilco,1.75:" +
                "009G,Toothbrush,77,Wilco,0.85:" +
                "336C,Comb,34,Wilco,0.99:" +
                "523E,Paper Pad Set,109,Congdon and Chrome,2.45:" +
                "888A,Fake Diamond Ring,111,AmericusDiamond,3.95:" +
                "176A,Romance Novel 1,20,Barnes and Noble,3.50:" +
                "176B,Romance Novel 2,20,Barnes and Noble,3.50:" +
                "176C,Romance Novel 3,20,Barnes and Noble,3.50:" +
                "500D,Floss,44,Wilco,1.25:" +
                "135B,Ant Farm,5,Wilco,8.00:" +
                "211Q,Bicycle,9,Schwinn,75.95:" +
                "932V,Pen Set,50,Congdon and Chrome,9.95:" +
                "678Q,Pencil 50,123,Congdon and Chrome,9.95:" +
                "239A,Colored Pencils,25,Congdon and Chrome,4.75:" +
                "975B,Shower Curtain,25,Wilco,6.50:" +
                "870K,Dog Bowl,15,Wilco,4.75:" +
                "231S,Cat Bowl,15,Wilco,4.75:" +
                "562M,Kitty Litter,15,Wilco,3.25:" +
                "777X,Dog Bone,15,Wilco,4.15:" +
                "933W,Cat Toy,15,Wilco,2.35:" +
                "215A,Hair Ball,0,Little Jimmy,0.00:";

        // Split the records string into individual rows
        String[] rows = records.split(":");

        // Iterate through each row and extract the product ID
        for (String row : rows) {
            // Split the row into column entries
            String[] columns = row.split(",");

            // Extract the product ID from the first column
            String productId = columns[0];

            // Output the product ID to the console
            System.out.println(productId);
        }
    }
}
