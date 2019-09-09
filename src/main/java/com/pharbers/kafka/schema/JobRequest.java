/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pharbers.kafka.schema;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class JobRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3707928045922596315L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"JobRequest\",\"namespace\":\"com.pharbers.kafka.schema\",\"fields\":[{\"name\":\"Name\",\"type\":\"string\"},{\"name\":\"JobType\",\"type\":\"string\"},{\"name\":\"Class\",\"type\":\"string\"},{\"name\":\"Master\",\"type\":\"string\"},{\"name\":\"DeployMode\",\"type\":\"string\"},{\"name\":\"ExecutorMemory\",\"type\":\"string\"},{\"name\":\"ExecutorCores\",\"type\":\"string\"},{\"name\":\"NumExecutors\",\"type\":\"string\"},{\"name\":\"Queue\",\"type\":\"string\"},{\"name\":\"Target\",\"type\":\"string\"},{\"name\":\"Parameters\",\"type\":\"string\"},{\"name\":\"Files\",\"type\":\"string\"},{\"name\":\"Conf\",\"type\":\"string\"},{\"name\":\"Jars\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence Name;
  @Deprecated public java.lang.CharSequence JobType;
  @Deprecated public java.lang.CharSequence Class;
  @Deprecated public java.lang.CharSequence Master;
  @Deprecated public java.lang.CharSequence DeployMode;
  @Deprecated public java.lang.CharSequence ExecutorMemory;
  @Deprecated public java.lang.CharSequence ExecutorCores;
  @Deprecated public java.lang.CharSequence NumExecutors;
  @Deprecated public java.lang.CharSequence Queue;
  @Deprecated public java.lang.CharSequence Target;
  @Deprecated public java.lang.CharSequence Parameters;
  @Deprecated public java.lang.CharSequence Files;
  @Deprecated public java.lang.CharSequence Conf;
  @Deprecated public java.lang.CharSequence Jars;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public JobRequest() {}

  /**
   * All-args constructor.
   * @param Name The new value for Name
   * @param JobType The new value for JobType
   * @param Class The new value for Class
   * @param Master The new value for Master
   * @param DeployMode The new value for DeployMode
   * @param ExecutorMemory The new value for ExecutorMemory
   * @param ExecutorCores The new value for ExecutorCores
   * @param NumExecutors The new value for NumExecutors
   * @param Queue The new value for Queue
   * @param Target The new value for Target
   * @param Parameters The new value for Parameters
   * @param Files The new value for Files
   * @param Conf The new value for Conf
   * @param Jars The new value for Jars
   */
  public JobRequest(java.lang.CharSequence Name, java.lang.CharSequence JobType, java.lang.CharSequence Class, java.lang.CharSequence Master, java.lang.CharSequence DeployMode, java.lang.CharSequence ExecutorMemory, java.lang.CharSequence ExecutorCores, java.lang.CharSequence NumExecutors, java.lang.CharSequence Queue, java.lang.CharSequence Target, java.lang.CharSequence Parameters, java.lang.CharSequence Files, java.lang.CharSequence Conf, java.lang.CharSequence Jars) {
    this.Name = Name;
    this.JobType = JobType;
    this.Class = Class;
    this.Master = Master;
    this.DeployMode = DeployMode;
    this.ExecutorMemory = ExecutorMemory;
    this.ExecutorCores = ExecutorCores;
    this.NumExecutors = NumExecutors;
    this.Queue = Queue;
    this.Target = Target;
    this.Parameters = Parameters;
    this.Files = Files;
    this.Conf = Conf;
    this.Jars = Jars;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Name;
    case 1: return JobType;
    case 2: return Class;
    case 3: return Master;
    case 4: return DeployMode;
    case 5: return ExecutorMemory;
    case 6: return ExecutorCores;
    case 7: return NumExecutors;
    case 8: return Queue;
    case 9: return Target;
    case 10: return Parameters;
    case 11: return Files;
    case 12: return Conf;
    case 13: return Jars;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Name = (java.lang.CharSequence)value$; break;
    case 1: JobType = (java.lang.CharSequence)value$; break;
    case 2: Class = (java.lang.CharSequence)value$; break;
    case 3: Master = (java.lang.CharSequence)value$; break;
    case 4: DeployMode = (java.lang.CharSequence)value$; break;
    case 5: ExecutorMemory = (java.lang.CharSequence)value$; break;
    case 6: ExecutorCores = (java.lang.CharSequence)value$; break;
    case 7: NumExecutors = (java.lang.CharSequence)value$; break;
    case 8: Queue = (java.lang.CharSequence)value$; break;
    case 9: Target = (java.lang.CharSequence)value$; break;
    case 10: Parameters = (java.lang.CharSequence)value$; break;
    case 11: Files = (java.lang.CharSequence)value$; break;
    case 12: Conf = (java.lang.CharSequence)value$; break;
    case 13: Jars = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'Name' field.
   * @return The value of the 'Name' field.
   */
  public java.lang.CharSequence getName() {
    return Name;
  }

  /**
   * Sets the value of the 'Name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.Name = value;
  }

  /**
   * Gets the value of the 'JobType' field.
   * @return The value of the 'JobType' field.
   */
  public java.lang.CharSequence getJobType() {
    return JobType;
  }

  /**
   * Sets the value of the 'JobType' field.
   * @param value the value to set.
   */
  public void setJobType(java.lang.CharSequence value) {
    this.JobType = value;
  }

  /**
   * Gets the value of the 'Class' field.
   * @return The value of the 'Class' field.
   */
  public java.lang.CharSequence getClass$() {
    return Class;
  }

  /**
   * Sets the value of the 'Class' field.
   * @param value the value to set.
   */
  public void setClass$(java.lang.CharSequence value) {
    this.Class = value;
  }

  /**
   * Gets the value of the 'Master' field.
   * @return The value of the 'Master' field.
   */
  public java.lang.CharSequence getMaster() {
    return Master;
  }

  /**
   * Sets the value of the 'Master' field.
   * @param value the value to set.
   */
  public void setMaster(java.lang.CharSequence value) {
    this.Master = value;
  }

  /**
   * Gets the value of the 'DeployMode' field.
   * @return The value of the 'DeployMode' field.
   */
  public java.lang.CharSequence getDeployMode() {
    return DeployMode;
  }

  /**
   * Sets the value of the 'DeployMode' field.
   * @param value the value to set.
   */
  public void setDeployMode(java.lang.CharSequence value) {
    this.DeployMode = value;
  }

  /**
   * Gets the value of the 'ExecutorMemory' field.
   * @return The value of the 'ExecutorMemory' field.
   */
  public java.lang.CharSequence getExecutorMemory() {
    return ExecutorMemory;
  }

  /**
   * Sets the value of the 'ExecutorMemory' field.
   * @param value the value to set.
   */
  public void setExecutorMemory(java.lang.CharSequence value) {
    this.ExecutorMemory = value;
  }

  /**
   * Gets the value of the 'ExecutorCores' field.
   * @return The value of the 'ExecutorCores' field.
   */
  public java.lang.CharSequence getExecutorCores() {
    return ExecutorCores;
  }

  /**
   * Sets the value of the 'ExecutorCores' field.
   * @param value the value to set.
   */
  public void setExecutorCores(java.lang.CharSequence value) {
    this.ExecutorCores = value;
  }

  /**
   * Gets the value of the 'NumExecutors' field.
   * @return The value of the 'NumExecutors' field.
   */
  public java.lang.CharSequence getNumExecutors() {
    return NumExecutors;
  }

  /**
   * Sets the value of the 'NumExecutors' field.
   * @param value the value to set.
   */
  public void setNumExecutors(java.lang.CharSequence value) {
    this.NumExecutors = value;
  }

  /**
   * Gets the value of the 'Queue' field.
   * @return The value of the 'Queue' field.
   */
  public java.lang.CharSequence getQueue() {
    return Queue;
  }

  /**
   * Sets the value of the 'Queue' field.
   * @param value the value to set.
   */
  public void setQueue(java.lang.CharSequence value) {
    this.Queue = value;
  }

  /**
   * Gets the value of the 'Target' field.
   * @return The value of the 'Target' field.
   */
  public java.lang.CharSequence getTarget() {
    return Target;
  }

  /**
   * Sets the value of the 'Target' field.
   * @param value the value to set.
   */
  public void setTarget(java.lang.CharSequence value) {
    this.Target = value;
  }

  /**
   * Gets the value of the 'Parameters' field.
   * @return The value of the 'Parameters' field.
   */
  public java.lang.CharSequence getParameters() {
    return Parameters;
  }

  /**
   * Sets the value of the 'Parameters' field.
   * @param value the value to set.
   */
  public void setParameters(java.lang.CharSequence value) {
    this.Parameters = value;
  }

  /**
   * Gets the value of the 'Files' field.
   * @return The value of the 'Files' field.
   */
  public java.lang.CharSequence getFiles() {
    return Files;
  }

  /**
   * Sets the value of the 'Files' field.
   * @param value the value to set.
   */
  public void setFiles(java.lang.CharSequence value) {
    this.Files = value;
  }

  /**
   * Gets the value of the 'Conf' field.
   * @return The value of the 'Conf' field.
   */
  public java.lang.CharSequence getConf() {
    return Conf;
  }

  /**
   * Sets the value of the 'Conf' field.
   * @param value the value to set.
   */
  public void setConf(java.lang.CharSequence value) {
    this.Conf = value;
  }

  /**
   * Gets the value of the 'Jars' field.
   * @return The value of the 'Jars' field.
   */
  public java.lang.CharSequence getJars() {
    return Jars;
  }

  /**
   * Sets the value of the 'Jars' field.
   * @param value the value to set.
   */
  public void setJars(java.lang.CharSequence value) {
    this.Jars = value;
  }

  /**
   * Creates a new JobRequest RecordBuilder.
   * @return A new JobRequest RecordBuilder
   */
  public static com.pharbers.kafka.schema.JobRequest.Builder newBuilder() {
    return new com.pharbers.kafka.schema.JobRequest.Builder();
  }

  /**
   * Creates a new JobRequest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new JobRequest RecordBuilder
   */
  public static com.pharbers.kafka.schema.JobRequest.Builder newBuilder(com.pharbers.kafka.schema.JobRequest.Builder other) {
    return new com.pharbers.kafka.schema.JobRequest.Builder(other);
  }

  /**
   * Creates a new JobRequest RecordBuilder by copying an existing JobRequest instance.
   * @param other The existing instance to copy.
   * @return A new JobRequest RecordBuilder
   */
  public static com.pharbers.kafka.schema.JobRequest.Builder newBuilder(com.pharbers.kafka.schema.JobRequest other) {
    return new com.pharbers.kafka.schema.JobRequest.Builder(other);
  }

  /**
   * RecordBuilder for JobRequest instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<JobRequest>
    implements org.apache.avro.data.RecordBuilder<JobRequest> {

    private java.lang.CharSequence Name;
    private java.lang.CharSequence JobType;
    private java.lang.CharSequence Class;
    private java.lang.CharSequence Master;
    private java.lang.CharSequence DeployMode;
    private java.lang.CharSequence ExecutorMemory;
    private java.lang.CharSequence ExecutorCores;
    private java.lang.CharSequence NumExecutors;
    private java.lang.CharSequence Queue;
    private java.lang.CharSequence Target;
    private java.lang.CharSequence Parameters;
    private java.lang.CharSequence Files;
    private java.lang.CharSequence Conf;
    private java.lang.CharSequence Jars;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pharbers.kafka.schema.JobRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Name)) {
        this.Name = data().deepCopy(fields()[0].schema(), other.Name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.JobType)) {
        this.JobType = data().deepCopy(fields()[1].schema(), other.JobType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.Class)) {
        this.Class = data().deepCopy(fields()[2].schema(), other.Class);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Master)) {
        this.Master = data().deepCopy(fields()[3].schema(), other.Master);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.DeployMode)) {
        this.DeployMode = data().deepCopy(fields()[4].schema(), other.DeployMode);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.ExecutorMemory)) {
        this.ExecutorMemory = data().deepCopy(fields()[5].schema(), other.ExecutorMemory);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.ExecutorCores)) {
        this.ExecutorCores = data().deepCopy(fields()[6].schema(), other.ExecutorCores);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.NumExecutors)) {
        this.NumExecutors = data().deepCopy(fields()[7].schema(), other.NumExecutors);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.Queue)) {
        this.Queue = data().deepCopy(fields()[8].schema(), other.Queue);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.Target)) {
        this.Target = data().deepCopy(fields()[9].schema(), other.Target);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.Parameters)) {
        this.Parameters = data().deepCopy(fields()[10].schema(), other.Parameters);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.Files)) {
        this.Files = data().deepCopy(fields()[11].schema(), other.Files);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.Conf)) {
        this.Conf = data().deepCopy(fields()[12].schema(), other.Conf);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.Jars)) {
        this.Jars = data().deepCopy(fields()[13].schema(), other.Jars);
        fieldSetFlags()[13] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing JobRequest instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pharbers.kafka.schema.JobRequest other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.Name)) {
        this.Name = data().deepCopy(fields()[0].schema(), other.Name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.JobType)) {
        this.JobType = data().deepCopy(fields()[1].schema(), other.JobType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.Class)) {
        this.Class = data().deepCopy(fields()[2].schema(), other.Class);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.Master)) {
        this.Master = data().deepCopy(fields()[3].schema(), other.Master);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.DeployMode)) {
        this.DeployMode = data().deepCopy(fields()[4].schema(), other.DeployMode);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.ExecutorMemory)) {
        this.ExecutorMemory = data().deepCopy(fields()[5].schema(), other.ExecutorMemory);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.ExecutorCores)) {
        this.ExecutorCores = data().deepCopy(fields()[6].schema(), other.ExecutorCores);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.NumExecutors)) {
        this.NumExecutors = data().deepCopy(fields()[7].schema(), other.NumExecutors);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.Queue)) {
        this.Queue = data().deepCopy(fields()[8].schema(), other.Queue);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.Target)) {
        this.Target = data().deepCopy(fields()[9].schema(), other.Target);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.Parameters)) {
        this.Parameters = data().deepCopy(fields()[10].schema(), other.Parameters);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.Files)) {
        this.Files = data().deepCopy(fields()[11].schema(), other.Files);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.Conf)) {
        this.Conf = data().deepCopy(fields()[12].schema(), other.Conf);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.Jars)) {
        this.Jars = data().deepCopy(fields()[13].schema(), other.Jars);
        fieldSetFlags()[13] = true;
      }
    }

    /**
      * Gets the value of the 'Name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return Name;
    }

    /**
      * Sets the value of the 'Name' field.
      * @param value The value of 'Name'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.Name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'Name' field has been set.
      * @return True if the 'Name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'Name' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder clearName() {
      Name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'JobType' field.
      * @return The value.
      */
    public java.lang.CharSequence getJobType() {
      return JobType;
    }

    /**
      * Sets the value of the 'JobType' field.
      * @param value The value of 'JobType'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder setJobType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.JobType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'JobType' field has been set.
      * @return True if the 'JobType' field has been set, false otherwise.
      */
    public boolean hasJobType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'JobType' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder clearJobType() {
      JobType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'Class' field.
      * @return The value.
      */
    public java.lang.CharSequence getClass$() {
      return Class;
    }

    /**
      * Sets the value of the 'Class' field.
      * @param value The value of 'Class'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder setClass$(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.Class = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'Class' field has been set.
      * @return True if the 'Class' field has been set, false otherwise.
      */
    public boolean hasClass$() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'Class' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder clearClass$() {
      Class = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'Master' field.
      * @return The value.
      */
    public java.lang.CharSequence getMaster() {
      return Master;
    }

    /**
      * Sets the value of the 'Master' field.
      * @param value The value of 'Master'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder setMaster(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.Master = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'Master' field has been set.
      * @return True if the 'Master' field has been set, false otherwise.
      */
    public boolean hasMaster() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'Master' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder clearMaster() {
      Master = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'DeployMode' field.
      * @return The value.
      */
    public java.lang.CharSequence getDeployMode() {
      return DeployMode;
    }

    /**
      * Sets the value of the 'DeployMode' field.
      * @param value The value of 'DeployMode'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder setDeployMode(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.DeployMode = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'DeployMode' field has been set.
      * @return True if the 'DeployMode' field has been set, false otherwise.
      */
    public boolean hasDeployMode() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'DeployMode' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder clearDeployMode() {
      DeployMode = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'ExecutorMemory' field.
      * @return The value.
      */
    public java.lang.CharSequence getExecutorMemory() {
      return ExecutorMemory;
    }

    /**
      * Sets the value of the 'ExecutorMemory' field.
      * @param value The value of 'ExecutorMemory'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder setExecutorMemory(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.ExecutorMemory = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'ExecutorMemory' field has been set.
      * @return True if the 'ExecutorMemory' field has been set, false otherwise.
      */
    public boolean hasExecutorMemory() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'ExecutorMemory' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder clearExecutorMemory() {
      ExecutorMemory = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'ExecutorCores' field.
      * @return The value.
      */
    public java.lang.CharSequence getExecutorCores() {
      return ExecutorCores;
    }

    /**
      * Sets the value of the 'ExecutorCores' field.
      * @param value The value of 'ExecutorCores'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder setExecutorCores(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.ExecutorCores = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'ExecutorCores' field has been set.
      * @return True if the 'ExecutorCores' field has been set, false otherwise.
      */
    public boolean hasExecutorCores() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'ExecutorCores' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder clearExecutorCores() {
      ExecutorCores = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'NumExecutors' field.
      * @return The value.
      */
    public java.lang.CharSequence getNumExecutors() {
      return NumExecutors;
    }

    /**
      * Sets the value of the 'NumExecutors' field.
      * @param value The value of 'NumExecutors'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder setNumExecutors(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.NumExecutors = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'NumExecutors' field has been set.
      * @return True if the 'NumExecutors' field has been set, false otherwise.
      */
    public boolean hasNumExecutors() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'NumExecutors' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder clearNumExecutors() {
      NumExecutors = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'Queue' field.
      * @return The value.
      */
    public java.lang.CharSequence getQueue() {
      return Queue;
    }

    /**
      * Sets the value of the 'Queue' field.
      * @param value The value of 'Queue'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder setQueue(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.Queue = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'Queue' field has been set.
      * @return True if the 'Queue' field has been set, false otherwise.
      */
    public boolean hasQueue() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'Queue' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder clearQueue() {
      Queue = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'Target' field.
      * @return The value.
      */
    public java.lang.CharSequence getTarget() {
      return Target;
    }

    /**
      * Sets the value of the 'Target' field.
      * @param value The value of 'Target'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder setTarget(java.lang.CharSequence value) {
      validate(fields()[9], value);
      this.Target = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'Target' field has been set.
      * @return True if the 'Target' field has been set, false otherwise.
      */
    public boolean hasTarget() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'Target' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder clearTarget() {
      Target = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'Parameters' field.
      * @return The value.
      */
    public java.lang.CharSequence getParameters() {
      return Parameters;
    }

    /**
      * Sets the value of the 'Parameters' field.
      * @param value The value of 'Parameters'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder setParameters(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.Parameters = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'Parameters' field has been set.
      * @return True if the 'Parameters' field has been set, false otherwise.
      */
    public boolean hasParameters() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'Parameters' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder clearParameters() {
      Parameters = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    /**
      * Gets the value of the 'Files' field.
      * @return The value.
      */
    public java.lang.CharSequence getFiles() {
      return Files;
    }

    /**
      * Sets the value of the 'Files' field.
      * @param value The value of 'Files'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder setFiles(java.lang.CharSequence value) {
      validate(fields()[11], value);
      this.Files = value;
      fieldSetFlags()[11] = true;
      return this;
    }

    /**
      * Checks whether the 'Files' field has been set.
      * @return True if the 'Files' field has been set, false otherwise.
      */
    public boolean hasFiles() {
      return fieldSetFlags()[11];
    }


    /**
      * Clears the value of the 'Files' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder clearFiles() {
      Files = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /**
      * Gets the value of the 'Conf' field.
      * @return The value.
      */
    public java.lang.CharSequence getConf() {
      return Conf;
    }

    /**
      * Sets the value of the 'Conf' field.
      * @param value The value of 'Conf'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder setConf(java.lang.CharSequence value) {
      validate(fields()[12], value);
      this.Conf = value;
      fieldSetFlags()[12] = true;
      return this;
    }

    /**
      * Checks whether the 'Conf' field has been set.
      * @return True if the 'Conf' field has been set, false otherwise.
      */
    public boolean hasConf() {
      return fieldSetFlags()[12];
    }


    /**
      * Clears the value of the 'Conf' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder clearConf() {
      Conf = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /**
      * Gets the value of the 'Jars' field.
      * @return The value.
      */
    public java.lang.CharSequence getJars() {
      return Jars;
    }

    /**
      * Sets the value of the 'Jars' field.
      * @param value The value of 'Jars'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder setJars(java.lang.CharSequence value) {
      validate(fields()[13], value);
      this.Jars = value;
      fieldSetFlags()[13] = true;
      return this;
    }

    /**
      * Checks whether the 'Jars' field has been set.
      * @return True if the 'Jars' field has been set, false otherwise.
      */
    public boolean hasJars() {
      return fieldSetFlags()[13];
    }


    /**
      * Clears the value of the 'Jars' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.JobRequest.Builder clearJars() {
      Jars = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    @Override
    public JobRequest build() {
      try {
        JobRequest record = new JobRequest();
        record.Name = fieldSetFlags()[0] ? this.Name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.JobType = fieldSetFlags()[1] ? this.JobType : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.Class = fieldSetFlags()[2] ? this.Class : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.Master = fieldSetFlags()[3] ? this.Master : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.DeployMode = fieldSetFlags()[4] ? this.DeployMode : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.ExecutorMemory = fieldSetFlags()[5] ? this.ExecutorMemory : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.ExecutorCores = fieldSetFlags()[6] ? this.ExecutorCores : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.NumExecutors = fieldSetFlags()[7] ? this.NumExecutors : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.Queue = fieldSetFlags()[8] ? this.Queue : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.Target = fieldSetFlags()[9] ? this.Target : (java.lang.CharSequence) defaultValue(fields()[9]);
        record.Parameters = fieldSetFlags()[10] ? this.Parameters : (java.lang.CharSequence) defaultValue(fields()[10]);
        record.Files = fieldSetFlags()[11] ? this.Files : (java.lang.CharSequence) defaultValue(fields()[11]);
        record.Conf = fieldSetFlags()[12] ? this.Conf : (java.lang.CharSequence) defaultValue(fields()[12]);
        record.Jars = fieldSetFlags()[13] ? this.Jars : (java.lang.CharSequence) defaultValue(fields()[13]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
