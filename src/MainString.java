public class MainString {
        public static void main(String[] args) {

            String[] stArr1 = {"I am testing", "hi", "bye bye"};
            String[] stArr2 = {"hello", "bye", "test"};

            int matches = 0;

            for (int i = 0; i < stArr1.length; i++) {
                for (int j = 0; j < stArr2.length; j++) {
                    if (stArr1[i].contains(stArr2[j])) {
                        System.out.println(stArr1[i] + "  found at index " + i);
                    }
                }
            }
        }
}
