
        static int rev_num = 0;
        static int base_pos = 1;

        static int reverseDigits(int num) {
            if (num > 0) {
                reverseDigits(num / 10);
                rev_num += (num % 10) * base_pos;
                base_pos *= 10;
            }
            return rev_num;
        }
   
