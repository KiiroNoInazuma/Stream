interface Print {
    <T> void print(T st);

    default <T> void test(T st) {
        print(st);
    }


}