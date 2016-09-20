package com.epam.java.academy.FirstMavePlugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Say Hi
 * @author Peter_Fazekas
 *
 */

@Mojo( name = "sayhi")
public class App extends AbstractMojo 
{

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Hi");
    }
}
