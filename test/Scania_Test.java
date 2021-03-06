import org.junit.Before;
import org.junit.Test;

public class Scania_Test {
    Scania scania;
    @Before
    public void init(){
        scania=new Scania();
    }
    @Test
    public void testLiftFlak(){
        double startAngle=scania.getFlakAngle();
        scania.liftFlak(40);
        assert(startAngle<scania.getFlakAngle());
    }
    @Test
    public void testLowerFlak(){
        scania.liftFlak(30);
        double currentAngle=scania.getFlakAngle();
        scania.lowerFlak(30);
        assert(currentAngle>scania.getFlakAngle());
    }

    //test för setCurrentSpeed
}
