/*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*  	http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/

package io.securecodebox.persistence.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedList;

import java.util.List;
import lombok.Data;

@Data
public class ProductPayload {
    @JsonProperty
    String name;

    @JsonProperty
    String description;

    @JsonProperty
    protected List<String> tags = new LinkedList<>();    

    @JsonProperty
    int prod_type = 1;

    public ProductPayload(String productName, String productDescription) {
        name = productName;
        description = productDescription;
    }
    public ProductPayload(String productName, String productDescription, List<String> productTags, int productType) {
        name = productName;
        description = productDescription;
        tags = productTags;
        prod_type = productType;
    }
}
