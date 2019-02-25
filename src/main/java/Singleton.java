public class Singleton {
    private volatile Singleton instance;
    private Singleton(){}
    public Singleton getInstance(){
        Singleton result = instance;
        if(result==null){
            synchronized (this){
                result = instance;
                if(result==null){
                    instance = result = new Singleton();
                }
            }
        }
        return instance;
    }
}
