1) Assuming that sing in real life is not just sysout and has specific implementations as per behaviour.
Thus instead of creating a method which take String as an argument for fly, sing etc., using Strategy pattern to define implementations which I assumed is intended here.
2) I know that factory is using static method and thus is not extendable by inheritance, but it suffices for this simple use case.
3) Fly is meant as noun when used as class name.
4) Made Rooster extend Chicken. Else could have added male/female boolean p
5) Launcher runs the code and there is difference of 1 in fly and walk because butterfly state changes after metamorphose.
