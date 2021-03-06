/*
 * Copyright (C) 2019 Maciej Laskowski
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.skejven;

import io.vertx.codegen.annotations.DataObject;
import io.vertx.core.json.JsonObject;

@DataObject(generateConverter = true, publicConverter = false)
public class SecurityHandlerOptions {

  private String name;
  private String type;
  private JsonObject config;

  public SecurityHandlerOptions(JsonObject json) {
    this.config = new JsonObject();
    SecurityHandlerOptionsConverter.fromJson(json, this);
  }

  public JsonObject toJson() {
    JsonObject json = new JsonObject();
    SecurityHandlerOptionsConverter.toJson(this, json);
    return json;
  }

  public String getName() {
    return name;
  }

  public SecurityHandlerOptions setName(String name) {
    this.name = name;
    return this;
  }

  public String getType() {
    return type;
  }

  public SecurityHandlerOptions setType(String type) {
    this.type = type;
    return this;
  }

  public JsonObject getConfig() {
    return config;
  }

  public SecurityHandlerOptions setConfig(JsonObject config) {
    this.config = config;
    return this;
  }

  @Override
  public String toString() {
    return this.toJson().encodePrettily();
  }
}
