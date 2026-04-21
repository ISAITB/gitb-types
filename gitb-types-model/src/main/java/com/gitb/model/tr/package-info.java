/*
 * Copyright (C) 2026 European Union
 *
 * Licensed under the EUPL, Version 1.2 or - as soon they will be approved by the European Commission - subsequent
 * versions of the EUPL (the "Licence"); You may not use this work except in compliance with the Licence.
 *
 * You may obtain a copy of the Licence at:
 *
 * https://interoperable-europe.ec.europa.eu/collection/eupl/eupl-text-eupl-12
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is distributed on an
 * "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the Licence for
 * the specific language governing permissions and limitations under the Licence.
 */

/**
 * Report and result types used to communicate GITB Test Assertion Report (TAR) information.
 *
 * <p>This package contains the classes that model reports produced by messaging, processing and
 * validation operations, including:
 * <ul>
 *   <li>The primary report type: {@link com.gitb.model.tr.TAR}.</li>
 *   <li>Report items: {@link com.gitb.model.tr.ReportItem}.</li>
 *   <li>Counters and overview: {@link com.gitb.model.tr.ValidationCounters},
 *       {@link com.gitb.model.tr.ValidationOverview}.</li>
 *   <li>Base report type: {@link com.gitb.model.tr.TestStepReportType}.</li>
 *   <li>Supporting enumerations: {@link com.gitb.model.tr.SeverityLevel},
 *       {@link com.gitb.model.tr.TestResultType}.</li>
 * </ul>
 */
package com.gitb.model.tr;

