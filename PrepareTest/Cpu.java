package PrepareTest;


import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.lang.management.OperatingSystemMXBean;

public class Cpu {
    public static void main(String[] args) {
        // Getting the MemoryMXBean
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();

        // Getting the OperatingSystemMXBean
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();

        // Displaying memory usage
        MemoryUsage heapMemoryUsage = memoryBean.getHeapMemoryUsage();
        MemoryUsage nonHeapMemoryUsage = memoryBean.getNonHeapMemoryUsage();

        System.out.println("Heap Memory Usage:");
        System.out.println("Init: " + heapMemoryUsage.getInit() / 1024 / 1024 + " MB");
        System.out.println("Used: " + heapMemoryUsage.getUsed() / 1024 / 1024 + " MB");
        System.out.println("Committed: " + heapMemoryUsage.getCommitted() / 1024 / 1024 + " MB");
        System.out.println("Max: " + heapMemoryUsage.getMax() / 1024 / 1024 + " MB");

        System.out.println("\nNon-Heap Memory Usage:");
        System.out.println("Init: " + nonHeapMemoryUsage.getInit() / 1024 / 1024 + " MB");
        System.out.println("Used: " + nonHeapMemoryUsage.getUsed() / 1024 / 1024 + " MB");
        System.out.println("Committed: " + nonHeapMemoryUsage.getCommitted() / 1024 / 1024 + " MB");
        System.out.println("Max: " + nonHeapMemoryUsage.getMax() / 1024 / 1024 + " MB");

        // Displaying CPU usage
        // Note: OperatingSystemMXBean does not provide detailed CPU usage directly.
        // This is a simplified approach and might not work in all environments.
        if (osBean instanceof com.sun.management.OperatingSystemMXBean) {
            com.sun.management.OperatingSystemMXBean sunOsBean = (com.sun.management.OperatingSystemMXBean) osBean;
            System.out.println("\nCPU Load: " + sunOsBean.getSystemCpuLoad() * 100 + " %");
        } else {
            System.out.println("\nDetailed CPU usage information is not available.");
        }
    }
}
