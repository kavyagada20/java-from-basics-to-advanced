//Object class is the parent class of the all classes in java.
//THrowable inherits the properties of the object class.THrowable is the parent class of the exception as well as Error.
/*
 * Exception occured by our program.They are recoverable can be handled.They are 2 types :-
 * 1.Compile time exception(Checked Exception)
 * 2.Run time exception(UNChecked Exception)
 
 Error occursbecause of lack of system resourses(eg. ram,slow proccessing speed,out of memory);not our programs and thus,programmer cannot do anything.They are not recoverable cannot be handled.We must approach system adimistrator.Error is only of 1 type:-Run time exception(UNChecked Exception).

 ExceptionHierarchy:---
 Exception is the parent class of the following classes:-
 1.ClassNotFoundExecption
 2.NoSuchMethodExeecotions
 3.IOExecptions (iNPUToUTPUTEXECPTION)(which further inherits the following)
    a.EoFExecption(ENd of file Exception)
    b.FileNOtFoundExecption
    b.IntruptedIOExecption
 4.SQLException  
 5.RemotesException
 6.InterruptedExeption
 7.RunTimeException 
    a.ArithmeticException
    b.ClassCAstException
    c.NullPointerExeption
    d.IndexOutOfBoundExeption
        !.ArrayIndexOutOfBoundExeption
        !!.StringIndexOutOfBoundExeption
    e.IllegalargumentException
        !.NumbersFormatException
we have just wriiten th main main types of exception there are 1000s of types of exceptions.

Error:(is the parent class of the following class):-
1.VirualMachineError
    a.StaackOverFlowError
    b.OutOfMemoryError
2.LinkageError
    a.VerifyError
    b.ClassFormatError
    c.NoCLassFoundError
    and such many more
3.AssertionError

and much more....
.
.
.

we have just return the main main types 

From 1 to 6 types of Exception are CompileTime Exception(Checked) and 7th and all error are unchecked (runtime) Exception.
 */
