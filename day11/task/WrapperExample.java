public class WrapperExample {
    public static void main(String[] args) {
        
        byte primitiveByte = 10;
        Byte wrapperByte = Byte.valueOf(primitiveByte);
        byte unboxedByte = wrapperByte.byteValue();

        short primitiveShort = 20;
        Short wrapperShort = Short.valueOf(primitiveShort);
        short unboxedShort = wrapperShort.shortValue();

        int primitiveInt = 100;
        Integer wrapperInt = Integer.valueOf(primitiveInt);
        int unboxedInt = wrapperInt.intValue();

        long primitiveLong = 1000L;
        Long wrapperLong = Long.valueOf(primitiveLong);
        long unboxedLong = wrapperLong.longValue();

        float primitiveFloat = 10.5f;
        Float wrapperFloat = Float.valueOf(primitiveFloat);
        float unboxedFloat = wrapperFloat.floatValue();

        double primitiveDouble = 99.99;
        Double wrapperDouble = Double.valueOf(primitiveDouble);
        double unboxedDouble = wrapperDouble.doubleValue();

        char primitiveChar = 'A';
        Character wrapperChar = Character.valueOf(primitiveChar);
        char unboxedChar = wrapperChar.charValue();

        boolean primitiveBool = true;
        Boolean wrapperBool = Boolean.valueOf(primitiveBool);
        boolean unboxedBool = wrapperBool.booleanValue();

        System.out.println("integer wrapper " + wrapperInt);
        System.out.println("unboxed int " + unboxedInt);
        System.out.println("character wrapper " + wrapperChar);
        System.out.println("boolean unboxed " + unboxedBool);
    }
}
