public class SingletonThreadSafeExampe {
    static  SingletonThreadSafeExampe object1;
    private SingletonThreadSafeExampe()
    {}

    static SingletonThreadSafeExampe getInstance()
    {
        if (object1 == null) {
            synchronized (SingletonThreadSafeExampe.class) {
                if (object1 == null)
                {
                    object1 = new SingletonThreadSafeExampe();
                }
            }
        }
        return object1;
    }

}
