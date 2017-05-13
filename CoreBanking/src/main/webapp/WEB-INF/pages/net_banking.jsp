<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
h2 {
	background-color: #193387;
	padding: inherit;
}

h3 {
	background-color: #173543;
	color: #64645A;
	padding: inherit;
}
</style>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>
<header style="background-color: #164285">
<hr>
</header>
<body>
	<table width="100%" border="0" cellpadding="1" cellspacing="0">

		<tr>
			<th colspan="2" scope="col">
				<form:form id="form1" name="form1" method="POST" action="netBanking.htm" commandName="netCmd">
					<table width="100%" border="0" cellpadding="2" cellspacing="2"
						style="border: #000000 solid 2px; padding: 5px;">
						<tr>
							<th colspan="3" bgcolor="#000000" scope="col"
								style="height: 20px;"><font color="#FFFFFF">Customer
									Registration For new Account</font></th>
						</tr>
						<!-- <tr>
							<td width="28%" rowspan="1">
								<div align="center">
									<img src="../images/kdmconfig.png" width="48" height="48" />
								</div>
							</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr> -->
						<tr>
							<td width="24%"><div align="left">Account Number*</div></td>
							<td width="48%"><label>
									<div align="left">
										<form:input path="ACCOUNT_NUMBER" type="text" id="username" readonly="true"/>
									</div>
							</label></td>
						</tr>
						<tr>
							<td><div align="left">CIF Number *</div></td>
							<td><div align="left">
									<form:input path="CIF_NUMBER" type="text" id="cif" />
								</div></td>
						</tr>
						<tr>
							<td><div align="left">Bank *</div></td>
							<td><div align="left">
									<select name="BANK">
										<option value="">--Select Bank--</option>
										<option value="STATE BANK OF INDIA">STATE BANK OF
											INDIA</option>
									</select>
								</div></td>
						</tr>

						<tr>
							<td><div align="left">Country*</div></td>
							<td><div align="left">
									<form:select path="COUNTRY">
										<option value="">Country...</option>
										<option value="AF">Afghanistan</option>
										<option value="AL">Albania</option>
										<option value="DZ">Algeria</option>
										<option value="AS">American Samoa</option>
										<option value="AD">Andorra</option>
										<option value="AG">Angola</option>
										<option value="AI">Anguilla</option>
										<option value="AG">Antigua &amp; Barbuda</option>
										<option value="AR">Argentina</option>
										<option value="AA">Armenia</option>
										<option value="AW">Aruba</option>
										<option value="AU">Australia</option>
										<option value="AT">Austria</option>
										<option value="AZ">Azerbaijan</option>
										<option value="BS">Bahamas</option>
										<option value="BH">Bahrain</option>
										<option value="BD">Bangladesh</option>
										<option value="BB">Barbados</option>
										<option value="BY">Belarus</option>
										<option value="BE">Belgium</option>
										<option value="BZ">Belize</option>
										<option value="BJ">Benin</option>
										<option value="BM">Bermuda</option>
										<option value="BT">Bhutan</option>
										<option value="BO">Bolivia</option>
										<option value="BL">Bonaire</option>
										<option value="BA">Bosnia &amp; Herzegovina</option>
										<option value="BW">Botswana</option>
										<option value="BR">Brazil</option>
										<option value="BC">British Indian Ocean Ter</option>
										<option value="BN">Brunei</option>
										<option value="BG">Bulgaria</option>
										<option value="BF">Burkina Faso</option>
										<option value="BI">Burundi</option>
										<option value="KH">Cambodia</option>
										<option value="CM">Cameroon</option>
										<option value="CA">Canada</option>
										<option value="IC">Canary Islands</option>
										<option value="CV">Cape Verde</option>
										<option value="KY">Cayman Islands</option>
										<option value="CF">Central African Republic</option>
										<option value="TD">Chad</option>
										<option value="CD">Channel Islands</option>
										<option value="CL">Chile</option>
										<option value="CN">China</option>
										<option value="CI">Christmas Island</option>
										<option value="CS">Cocos Island</option>
										<option value="CO">Colombia</option>
										<option value="CC">Comoros</option>
										<option value="CG">Congo</option>
										<option value="CK">Cook Islands</option>
										<option value="CR">Costa Rica</option>
										<option value="CT">Cote D'Ivoire</option>
										<option value="HR">Croatia</option>
										<option value="CU">Cuba</option>
										<option value="CB">Curacao</option>
										<option value="CY">Cyprus</option>
										<option value="CZ">Czech Republic</option>
										<option value="DK">Denmark</option>
										<option value="DJ">Djibouti</option>
										<option value="DM">Dominica</option>
										<option value="DO">Dominican Republic</option>
										<option value="TM">East Timor</option>
										<option value="EC">Ecuador</option>
										<option value="EG">Egypt</option>
										<option value="SV">El Salvador</option>
										<option value="GQ">Equatorial Guinea</option>
										<option value="ER">Eritrea</option>
										<option value="EE">Estonia</option>
										<option value="ET">Ethiopia</option>
										<option value="FA">Falkland Islands</option>
										<option value="FO">Faroe Islands</option>
										<option value="FJ">Fiji</option>
										<option value="FI">Finland</option>
										<option value="FR">France</option>
										<option value="GF">French Guiana</option>
										<option value="PF">French Polynesia</option>
										<option value="FS">French Southern Ter</option>
										<option value="GA">Gabon</option>
										<option value="GM">Gambia</option>
										<option value="GE">Georgia</option>
										<option value="DE">Germany</option>
										<option value="GH">Ghana</option>
										<option value="GI">Gibraltar</option>
										<option value="GB">Great Britain</option>
										<option value="GR">Greece</option>
										<option value="GL">Greenland</option>
										<option value="GD">Grenada</option>
										<option value="GP">Guadeloupe</option>
										<option value="GU">Guam</option>
										<option value="GT">Guatemala</option>
										<option value="GN">Guinea</option>
										<option value="GY">Guyana</option>
										<option value="HT">Haiti</option>
										<option value="HW">Hawaii</option>
										<option value="HN">Honduras</option>
										<option value="HK">Hong Kong</option>
										<option value="HU">Hungary</option>
										<option value="IS">Iceland</option>
										<option value="IN">India</option>
										<option value="ID">Indonesia</option>
										<option value="IA">Iran</option>
										<option value="IQ">Iraq</option>
										<option value="IR">Ireland</option>
										<option value="IM">Isle of Man</option>
										<option value="IL">Israel</option>
										<option value="IT">Italy</option>
										<option value="JM">Jamaica</option>
										<option value="JP">Japan</option>
										<option value="JO">Jordan</option>
										<option value="KZ">Kazakhstan</option>
										<option value="KE">Kenya</option>
										<option value="KI">Kiribati</option>
										<option value="NK">Korea North</option>
										<option value="KS">Korea South</option>
										<option value="KW">Kuwait</option>
										<option value="KG">Kyrgyzstan</option>
										<option value="LA">Laos</option>
										<option value="LV">Latvia</option>
										<option value="LB">Lebanon</option>
										<option value="LS">Lesotho</option>
										<option value="LR">Liberia</option>
										<option value="LY">Libya</option>
										<option value="LI">Liechtenstein</option>
										<option value="LT">Lithuania</option>
										<option value="LU">Luxembourg</option>
										<option value="MO">Macau</option>
										<option value="MK">Macedonia</option>
										<option value="MG">Madagascar</option>
										<option value="MY">Malaysia</option>
										<option value="MW">Malawi</option>
										<option value="MV">Maldives</option>
										<option value="ML">Mali</option>
										<option value="MT">Malta</option>
										<option value="MH">Marshall Islands</option>
										<option value="MQ">Martinique</option>
										<option value="MR">Mauritania</option>
										<option value="MU">Mauritius</option>
										<option value="ME">Mayotte</option>
										<option value="MX">Mexico</option>
										<option value="MI">Midway Islands</option>
										<option value="MD">Moldova</option>
										<option value="MC">Monaco</option>
										<option value="MN">Mongolia</option>
										<option value="MS">Montserrat</option>
										<option value="MA">Morocco</option>
										<option value="MZ">Mozambique</option>
										<option value="MM">Myanmar</option>
										<option value="NA">Nambia</option>
										<option value="NU">Nauru</option>
										<option value="NP">Nepal</option>
										<option value="AN">Netherland Antilles</option>
										<option value="NL">Netherlands (Holland, Europe)</option>
										<option value="NV">Nevis</option>
										<option value="NC">New Caledonia</option>
										<option value="NZ">New Zealand</option>
										<option value="NI">Nicaragua</option>
										<option value="NE">Niger</option>
										<option value="NG">Nigeria</option>
										<option value="NW">Niue</option>
										<option value="NF">Norfolk Island</option>
										<option value="NO">Norway</option>
										<option value="OM">Oman</option>
										<option value="PK">Pakistan</option>
										<option value="PW">Palau Island</option>
										<option value="PS">Palestine</option>
										<option value="PA">Panama</option>
										<option value="PG">Papua New Guinea</option>
										<option value="PY">Paraguay</option>
										<option value="PE">Peru</option>
										<option value="PH">Philippines</option>
										<option value="PO">Pitcairn Island</option>
										<option value="PL">Poland</option>
										<option value="PT">Portugal</option>
										<option value="PR">Puerto Rico</option>
										<option value="QA">Qatar</option>
										<option value="ME">Republic of Montenegro</option>
										<option value="RS">Republic of Serbia</option>
										<option value="RE">Reunion</option>
										<option value="RO">Romania</option>
										<option value="RU">Russia</option>
										<option value="RW">Rwanda</option>
										<option value="NT">St Barthelemy</option>
										<option value="EU">St Eustatius</option>
										<option value="HE">St Helena</option>
										<option value="KN">St Kitts-Nevis</option>
										<option value="LC">St Lucia</option>
										<option value="MB">St Maarten</option>
										<option value="PM">St Pierre &amp; Miquelon</option>
										<option value="VC">St Vincent &amp; Grenadines</option>
										<option value="SP">Saipan</option>
										<option value="SO">Samoa</option>
										<option value="AS">Samoa American</option>
										<option value="SM">San Marino</option>
										<option value="ST">Sao Tome &amp; Principe</option>
										<option value="SA">Saudi Arabia</option>
										<option value="SN">Senegal</option>
										<option value="RS">Serbia</option>
										<option value="SC">Seychelles</option>
										<option value="SL">Sierra Leone</option>
										<option value="SG">Singapore</option>
										<option value="SK">Slovakia</option>
										<option value="SI">Slovenia</option>
										<option value="SB">Solomon Islands</option>
										<option value="OI">Somalia</option>
										<option value="ZA">South Africa</option>
										<option value="ES">Spain</option>
										<option value="LK">Sri Lanka</option>
										<option value="SD">Sudan</option>
										<option value="SR">Suriname</option>
										<option value="SZ">Swaziland</option>
										<option value="SE">Sweden</option>
										<option value="CH">Switzerland</option>
										<option value="SY">Syria</option>
										<option value="TA">Tahiti</option>
										<option value="TW">Taiwan</option>
										<option value="TJ">Tajikistan</option>
										<option value="TZ">Tanzania</option>
										<option value="TH">Thailand</option>
										<option value="TG">Togo</option>
										<option value="TK">Tokelau</option>
										<option value="TO">Tonga</option>
										<option value="TT">Trinidad &amp; Tobago</option>
										<option value="TN">Tunisia</option>
										<option value="TR">Turkey</option>
										<option value="TU">Turkmenistan</option>
										<option value="TC">Turks &amp; Caicos Is</option>
										<option value="TV">Tuvalu</option>
										<option value="UG">Uganda</option>
										<option value="UA">Ukraine</option>
										<option value="AE">United Arab Emirates</option>
										<option value="GB">United Kingdom</option>
										<option value="US">United States of America</option>
										<option value="UY">Uruguay</option>
										<option value="UZ">Uzbekistan</option>
										<option value="VU">Vanuatu</option>
										<option value="VS">Vatican City State</option>
										<option value="VE">Venezuela</option>
										<option value="VN">Vietnam</option>
										<option value="VB">Virgin Islands (Brit)</option>
										<option value="VA">Virgin Islands (USA)</option>
										<option value="WK">Wake Island</option>
										<option value="WF">Wallis &amp; Futana Is</option>
										<option value="YE">Yemen</option>
										<option value="ZR">Zaire</option>
										<option value="ZM">Zambia</option>
										<option value="ZW">Zimbabwe</option>
									</form:select>
								</div></td>
						</tr>
						<tr>
							<td><div align="left">Branch Code</div></td>
							<td><div align="left">
									<form:input path="BRANCH_CODE" type="text" id="answer" size="30" readonly="true"/>
								</div></td>
						</tr>
						<tr>
							<td><div align="left">Mobile:</div></td>
							<td><div align="left">
									<form:input path="MOBILE" type="text" id="mobile" />
								</div></td>
						</tr>
						<tr>
							<td><div align="left">Facility Required *</div></td>
							<td><div align="left">
									<form:select path="TX_TYPE">
										<option value="">--Select facility--</option>
										<option value="Full Transaction">Full Transaction
											Rights</option>
										<option value="Limited Transaction">Limited
											Transaction Rights</option>
									</form:select>
								</div></td>
						</tr>
						<!-- <tr>
							<td><div align="left">Enter the text as shown in the
									image *</div></td>
							<td><div align="left">
									<input name="email" type="text" id="email" />
								</div></td>
						</tr> -->

						<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td><label>
									<div align="right">
										<input type="submit" value="Register">
									</div>
							</label></td>
						</tr>
						<tr>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
					</table>
				</form:form>
			</th>
		</tr>
		<tr>
			<td width="50%">&nbsp;</td>
			<td width="50%">&nbsp;</td>
		</tr>
	</table>
	<h2>Mandatory fields are marked with an asterisk (*)</h2>

</body>
<footer>
<h3>@ Copyright SBI</h3>
</footer>
</html>
