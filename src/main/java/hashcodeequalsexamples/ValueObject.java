package hashcodeequalsexamples;

import java.util.Objects;

public class ValueObject {

    private String name;
    private int intValue;


    public ValueObject(String name, int intValue) {
        this.name = name;
        this.intValue = intValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValueObject that = (ValueObject) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode()+this.intValue;
    }

    @Override
    public String toString() {
        return "ValueObject{" +
            "name='" + name + '\'' +
            ", intValue=" + intValue +
            '}';
    }
}
