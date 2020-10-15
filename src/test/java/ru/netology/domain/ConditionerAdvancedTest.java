package ru.netology.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConditionerAdvancedTest {

    @Test
    public void shouldGetAndSet() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        String expected = "Samsung";
        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void decreaseCurrentTemperature() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(17);
        int currentTemperature = 20;
        int expected = 19;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureLessMin() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(17);
        int currentTemperature = 10;
        int expected = 0;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperature() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(17);
        int currentTemperature = 20;
        int expected = 21;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureMoreMax() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(17);
        int currentTemperature = 35;
        int expected = 35;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void checkMaxTemperature() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setMaxTemperature(35);
        int currentTemperature = 36;
        int expected = 35;
        conditioner.setCurrentTemperature(currentTemperature);
        assertEquals(expected, conditioner.getMaxTemperature());
    }

    @Test
    public void checkMinTemperature() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setMinTemperature(17);
        int expected = 17;
        assertEquals(expected, conditioner.getMinTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureIfMore() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(17);
        int currentTemperature = 36;
        int expected = 0;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
    @Test
    public void decreaseCurrentTemperatureIfTempBelowMin() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(17);
        int currentTemperature = 15;
        int expected = 0;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void ShouldGetAndSetOn() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setOn(false);
        boolean expected = false;
        assertEquals(expected, conditioner.isOn());
    }
    @Test
    public void SetAndGetMinTemperature() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setMinTemperature(17);
        int expected = 17;
        assertEquals(expected, conditioner.getMinTemperature());
    }
    @Test
    public void SetAndGetMaxTemperature() {
        ConditionerAdvanced conditioner = new ConditionerAdvanced();
        conditioner.setMaxTemperature(35);
        int expected = 35;
        assertEquals(expected, conditioner.getMaxTemperature());
    }
}