/*
 * Copyright (c) 2012-2013, Synflow SAS
 * All rights reserved.
 * 
 * REDISTRIBUTION of this file in source and binary forms, with or without
 * modification, is NOT permitted in any way.
 *
 * The use of this file in source and binary forms, with or without
 * modification, is permitted if you have a valid commercial license of
 * Synflow Studio.
 * If you do NOT have a valid license of Synflow Studio: you are NOT allowed
 * to use this file.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 * WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE
 */
package com.synflow.runtime;

/**
 * This interface defines an entity, which can be a task or a network.
 * 
 * @author Matthieu Wipliez
 * 
 */
public interface Entity {

	/**
	 * Commits future values.
	 */
	void commit();

	/**
	 * Connects ports.
	 */
	void connect(Port... ports);

	/**
	 * Executes.
	 */
	void execute();

	/**
	 * Returns the children of this entity. Empty for tasks.
	 * 
	 * @return an array of entities
	 */
	Entity[] getChildren();

	/**
	 * The input ports of this entity.
	 * 
	 * @return an array of ports
	 */
	Port[] getInputs();

	/**
	 * Returns the name of this entity.
	 * 
	 * @return a string containing this entity's name
	 */
	String getName();

	/**
	 * The output ports of this entity.
	 * 
	 * @return an array of ports
	 */
	Port[] getOutputs();

}
