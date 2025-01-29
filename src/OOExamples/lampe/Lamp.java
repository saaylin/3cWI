package OOExamples.lampe;

import jdk.jfr.FlightRecorder;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
        private List<licht> lightElements;

        public Lamp() {
            this.lightElements = new ArrayList<>();
        }

        public void addLightElement(licht lichtElement) {
            lightElements.add(lichtElement);
        }

        public void turnAllOn() {
            for (licht element : lightElements) {
                element.turnOn();
            }
        }

        public double getOverallPowerUsage() {
            double totalPowerUsage = 0;
            for (licht element : lightElements) {
                totalPowerUsage += element.getPowerUsage();
            }
            return totalPowerUsage;
        }

        public void printNamesOfLightElements() {
            for (licht element : lightElements) {
                System.out.println(element.getName());
            }
        }
    }
