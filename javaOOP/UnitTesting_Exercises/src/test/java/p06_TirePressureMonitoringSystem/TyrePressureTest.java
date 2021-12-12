package UnitTesting_Exercises.src.test.java.p06_TirePressureMonitoringSystem;

import UnitTesting_Exercises.src.main.java.p06_TirePressureMonitoringSystem.Alarm;
import UnitTesting_Exercises.src.main.java.p06_TirePressureMonitoringSystem.Sensor;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class TyrePressureTest {
    private static final double LOW_PRESSURE_VALUE = 12.0;
    private static final double HIGH_PRESSURE_VALUE = 50.0;
    private static final double NORMAL_PRESSURE_VALUE = 18.0;

    @Test
    public void testAlarmTurnsOnForLowPressure(){
        Sensor fakeSensorForLowPressure = Mockito.mock(Sensor.class);
        when(fakeSensorForLowPressure.popNextPressurePsiValue()).thenReturn(LOW_PRESSURE_VALUE);
        Alarm alarm = new Alarm(fakeSensorForLowPressure);
        alarm.check();
        Assert.assertTrue(alarm.getAlarmOn());
    }
    @Test
    public void testAlarmTurnsOnForHighPressure(){
        Sensor fakeSensorForHighPressure = Mockito.mock(Sensor.class);
        when(fakeSensorForHighPressure.popNextPressurePsiValue()).thenReturn(HIGH_PRESSURE_VALUE);
        Alarm alarm = new Alarm(fakeSensorForHighPressure);
        alarm.check();
        Assert.assertTrue(alarm.getAlarmOn());
    }
    @Test
    public void testAlarmTurnsOnForNormalPressure(){
        Sensor fakeSensorForLowPressure = Mockito.mock(Sensor.class);
        when(fakeSensorForLowPressure.popNextPressurePsiValue()).thenReturn(NORMAL_PRESSURE_VALUE);
        Alarm alarm = new Alarm(fakeSensorForLowPressure);
        alarm.check();
        Assert.assertFalse(alarm.getAlarmOn());
    }
}
