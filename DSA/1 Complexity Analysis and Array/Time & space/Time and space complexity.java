/*

------->>>>>>>>>>  Generally, there is always more than one way to solve a problem in computer science with different algorithms. Therefore, 
                    it is highly required to use a method to compare the solutions in order to judge which one is more optimal. The method must be:

                        - Independent of the machine and its configuration, on which the algorithm is running on.
                        - Shows a direct correlation with the number of inputs.
                        - Can distinguish two algorithms clearly without ambiguity(without any problume).

--------->>>>>>>>>>>>>   There are two such methods used, time complexity and space complexity which are discussed below:


---------->>>>>>>>>>>>>  Time Complexity:

                                    ------There are mainly three types of time complexity.
                                    (i) worst time complexity [big O]
                                    (ii) Avarage time complexity [theeta]
                                    (iii) best time complexity [oham]

                                    The time complexity of an algorithm quantifies the amount of time taken by an algorithm to run as a function of
                                    the length of the input. Note that the time to run is a function of the length of the input and not the actual 
                                    execution time of the machine on which the algorithm is running on.

                                    in short, time compexity = how many time code will be executed.

                                    - The valid algorithm takes a finite amount of time for execution. The time required by the algorithm to solve given
                                    problem is called time complexity  of the algorithm. Time complexity is very useful measure in algorithm analysis.
                                    - It is the time needed for the completion of an algorithm. To estimate the time complexity, we need to consider the
                                    cost of each fundamental instruction and the number of times the instruction is executed.


                                    EX 1 System.out.println("hello");
                                        -time comlexity : O(1) also called contant time complexity.

                                    EX 2 : for(i=0;i<10;i++){
                                        System.out.println("hello");
                                    }
                                    - here hello can be executed 10 times so time complexity is 10.
                                    - time complexity : O(n)

                                    EX 3 : for(i=0;i<2;i++){
                                                for(j=0;j<2;j++){
                                                    System.out.println("hello");
                                                }
                                    }
                                    - here hellow will be executed 4 times so time complexity is 4.
                                    - time complexity : O(n^2)

-------->>>>>>>>>>>>     Time complexity chart(Time complexity increse in this order)

                                        O(1) -> O(log n) -> O(n) -> O(n^2) -> O(n^3) -> O(2^x) -> O(n!)
 */




/*

---------->>>>>>>>>>>  Space complexity : 

                            - Space reqired to execute the code.

                            EX 1 : display(){
                                int sum = 10;
                                System.out.println(sum);
                            }
                            - Time complexity is O(1) also known as constance time complexity.

                            EX 2 : for(i=0;i<n;i++){
                                copy[i] = arr[i];
                            } return copy; 
                            - Space complexity os O(n) a;so known as linear space complexity , because copu[i] = arr[i]; can be executed n times so they can occupy n space

                            EX 3 : f(n){
                                if(n<=0){
                                    return 0;
                                } return n + f(n-1);
                            }
*/

/*

----------->>>>>>>>>>>>> Time complexity - lower
                        Space complexity - Higher


-------------->>>>>>>>>>>> Trade between time & space complexity then Time complexity get first Priority


 */