package com.epam.java.academy.FirstMavePlugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Say Bye
 * @author Peter_Fazekas
 *
 */

@Mojo( name = "saybye")
public class AppBye extends AbstractMojo 
{

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Bye");
    }
}
