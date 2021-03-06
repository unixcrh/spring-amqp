/*
 * Copyright 2002-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Describes an Erlang node.
 */
package org.springframework.erlang.core;

import java.io.Serializable;

/**
 * Simple description class for an Erlang node.
 *
 * @author Mark Pollack
 *
 */
@SuppressWarnings("serial")
public class Node implements Serializable {

	private String name;

	public Node(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Node [name=" + name + "]";
	}

}
