/* This program is free software: you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public License
 as published by the Free Software Foundation, either version 3 of
 the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package com.webapp.api.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.library.model.RouteR;


@XmlRootElement(name = "RouteListReport")
public class RouteListR {
	
	@XmlAttribute 
	@JsonSerialize
	public String metadata;
	
	@XmlAttribute 
	@JsonSerialize
	public String AgencyName;
	
	@XmlAttribute 
	@JsonSerialize
	public String AreaType;
	
	@XmlAttribute 
	@JsonSerialize
	public String AreaName;
    
    @XmlElement(name = "RouteListR")
    public Collection<RouteR> RouteR = new ArrayList<RouteR>();

}
