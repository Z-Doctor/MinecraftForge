package net.minecraftforge.fml.common.registry;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Run the full suite of tests
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({VanillaRegistryTests.class, FreezingTests.class, SubstitutionTests.class})
public class RegistryTestSuite
{
}
