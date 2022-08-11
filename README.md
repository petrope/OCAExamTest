# OCAExamTest
console application to prepare for OCA test
Requests:

With executions the parameters of main() should pass in: 
	0: Java type, 
	1: Test Type, 
	2: number of questions, 
	3: questions.txt, 
	4: output.txt.

stockTest(questions.txt): creates/adds Qeastions-Answers database

executeTest(JavaType=rags[0], TestType=args[1): 
calls arg[2] number of questions shuffled
print out question/codeSnipet/answers
waiting userInterface as were choosen
evaluates answers
writes question+answer+evaluation to output with PrintWriter

quit(): ends running
