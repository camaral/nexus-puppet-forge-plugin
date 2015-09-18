package org.sonatype.nexus.puppetforge;

import java.util.List;

/**
 Created by bhawkins on 9/16/15.
 */
public class Metadata
{
	private String name;
	private String version;
	private String author;
	private String summary;
	private String license;
	private String source;
	private String description;
	private List<Dependency> dependencies;

	public static class Dependency
	{
		private String name;
		private String version_requirement;

		public Dependency()
		{
		}

		public String getName()
		{
			return name;
		}

		public String getVersion_requirement()
		{
			return version_requirement;
		}
	}

	public Metadata()
	{
	}

	public String getName()
	{
		return name;
	}

	public String getVersion()
	{
		return version;
	}

	public String getAuthor()
	{
		return author;
	}

	public String getSummary()
	{
		return summary;
	}

	public String getLicense()
	{
		return license;
	}

	public String getSource()
	{
		return source;
	}

	public String getDescription()
	{
		return description;
	}

	public List<Dependency> getDependencies()
	{
		return dependencies;
	}
}
