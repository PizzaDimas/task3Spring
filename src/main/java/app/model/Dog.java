package app.model;

import org.springframework.stereotype.Component;

/**
 * @author pizza
 * 02.03.2024
 */
@Component("dog")
public class Dog extends Animal{
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
