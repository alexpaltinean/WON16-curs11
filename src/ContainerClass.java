public class ContainerClass {
    private final int i;

    public ContainerClass(int i) {
        this.i = i;
    }

    public static class NestedClass {
        private final int j;

        public NestedClass(int j) {
            this.j = j;
        }
    }

    public class InnerClass {
        private final int k;

        public InnerClass(int k) {
            this.k = k;
        }
    }
}
