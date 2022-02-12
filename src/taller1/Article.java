package taller1;

public class Article {
    
    private String codeArticle;
    private String nameArticle;
    private int priceArticle;

    public Article() {
    }

    public Article(String value1, String value2, int value3) {
        this.codeArticle = value1;
        this.nameArticle = value2;
        this.priceArticle = value3;
    }

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

    @Override
    public String toString() {
        return " [codeArticle=" + codeArticle + ", nameArticle=" + nameArticle + ", priceArticle=" + priceArticle
                + "]";
    }


    

    

    
}
