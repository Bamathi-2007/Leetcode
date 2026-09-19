class Solution {
    public String countAndSay(int n) {

        String current = "1";

        for (int k = 2; k <= n; k++) {

            StringBuilder next = new StringBuilder();

            int i = 0;

            while (i < current.length()) {

                char ch = current.charAt(i);
                int count = 0;

                while (i < current.length() && current.charAt(i) == ch) {
                    count++;
                    i++;
                }

                next.append(count);
                next.append(ch);
            }

            current = next.toString();
        }

        return current;
    }
}