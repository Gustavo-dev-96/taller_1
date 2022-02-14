package taller1;

public class Article {
    
    /**
     * class attributes
     */
    private String codeArticle;
    private String nameArticle;
    private int priceArticle;

    /**
     * constructor method
     */
    public Article() {
    }

    /**
     * the constructor takes three arguments
     * @param value1 receive the product code
     * @param value2 get the name of the product
     * @param value3 receive the price of the product
     */
    public Article(String value1, String value2, int value3) {
        this.codeArticle = value1;
        this.nameArticle = value2;
        this.priceArticle = value3;
    }

    /**
     * getter and setter
     */
    public String getCode() {
        return codeArticle;
    }

    public void setCode(String code) {
        this.codeArticle = code;
    }


    public String getNombre() {
        return nameArticle;
    }


    public void setNombre(String nombre) {
        this.nameArticle = nombre;
    }

    public int getPriceArticle() {
        return priceArticle;
    }


    public void setPriceArticle(int priceArticle) {
        this.priceArticle = priceArticle;
    }

    /**
     * method to print the attributes of the class
     * inherit the tostring method
     */

    @Override
    public String toString() {
        return " [codeArticle=" + codeArticle + ", nameArticle=" + nameArticle + ", priceArticle=" + priceArticle
                + "]";
    }


    

    

    
}
