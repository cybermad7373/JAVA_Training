package Problems;

public class findString {
}




//
//        Problem statement
//        Given a state diagram in the form of a linked list, where each node represents a unique character and has
//        two pointers ('next' and 'random'), and a string 'str', find if this string is acceptable by the state diagram or not.
//
//        The state diagram looks something like this:
//
//
//        A string is said to be acceptable if and only if it matches the flow of states character by character and ends at final
//        state i.e. state with next equal to 'null'. For the below diagram 'c' is the final state.
//
//                Note
//         1. The random pointer of a node may point to NULL or to itself.
//         2. All the nodes will represent unique characters.
//         3. All the characters will be the lowercase alphabets.
//                4. You can assume that the first state is the first character of the string.
//        Detailed explanation ( Input/output format, Notes, Images )
//        Constraints:
//                1 < =T <= 10
//                1 <= N <= 26
//                1 <= ai <= N, or ai = -1(if pointing to NULL)
//                1 <= len(str) <= 10^5
//
//        Time Limit: 1 sec
//        Sample Input 1:
//                1
//                4
//        abcd
//        1 4 2 4
//        abcbddd
//        Sample Output 1:
//        yes
//        Explanation of the Sample Input1:
//        Notice that the state with character ‘b’ has its random pointer pointing to the state with the character ‘d’,
//        and the state with the character ‘d’ (which is also the final state) has its random pointer pointing to itself.
//
//        The transitions will be as follows:
//
//                (next)  (next) (random) (random) (random) (random)
//        a ----->b----->c------->b------>d ------>d ------>d(final state)
//        Sample Input 2:
//                1
//                3
//        abc
//        3 2 -1
//        abcc
//        Sample Output 2:
//        no