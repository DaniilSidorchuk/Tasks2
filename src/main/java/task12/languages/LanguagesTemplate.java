package task12.languages;

public abstract class LanguagesTemplate {

    final void chainOfCreation(){
        codeWriting();
        codeDebuging();
        codeCompilation();
        programmTesting();
        programmLaunching();
    }

    public abstract void codeWriting();
    public abstract void codeDebuging();
    public abstract void codeCompilation();
    public abstract void programmTesting();
    public abstract void programmLaunching();

}
