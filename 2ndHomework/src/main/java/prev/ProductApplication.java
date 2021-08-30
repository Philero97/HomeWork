package prev;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Cart cart = context.getBean(Cart.class);
        System.out.println(cart);
        CartApp consoleApp = new CartApp();
        consoleApp.CartApp(cart);
        System.out.println(cart);


        cart = context.getBean(Cart.class);
        System.out.println(cart);
        ProductRepository pr = context.getBean(ProductRepository.class);
        System.out.println(pr.findAll());
    }
}











//    public ArrayList(int initialCapacity){
//        if (initialCapacity>0){
//            this.elementData=new Object[initialCapacity];
//        }else if (initialCapacity==0){
//            this.elementData= EMPTY_ELEMENTDATA;
//        } else{
//            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
//        }
//    }
//    public boolean add(E e){
//        modCount++;
//        add(e,elementData, size);
//        return true;
//    }
//
//    private void add(E e, Object[] elementData, int s){
//        if(s == elementData.length)
//            elementData = grow();
//        elementData[s] = e;
//        size = s + 1;
//    }
