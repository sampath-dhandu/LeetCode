package practise;

public class TypeParameter {

    public static void main(String[] args) {
        System.out.println(createStringDataContainer().getValue());
    }

    static DataContainer<String> createStringDataContainer() {
        return new DataContainer<String>("hello");
    }

}

class DataContainer<T> {
    private T value;

    public DataContainer(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}