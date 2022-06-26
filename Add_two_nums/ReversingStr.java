class Reverse {
    public static void main(String[] args){
        String h = "Hello";
        String r = "";
        for (int i=0; i<h.length(); i++)
        {
             char ch= h.charAt(i); //extracts each character
             //System.out.println(ch);
             r = ch+r; //adds each character in front of the existing string
             System.out.println(r);
        }
        System.out.println(r);
    }
}