;(function() {
	'use strict';

	angular.module('clientApp')
	  .directive('knowledgelevels', knowledgelevels);

	function knowledgelevels() {
	    return {
			template: '<div></div>',
			restrict: 'E',
			scope: {
				knowledge: '=',
			},
			link: function postLink(scope, element, attrs) {
				var nLevels = 11; // 0 ~ 10
				var htmlText = '<div class="btn-group" data-toggle="buttons">';
				function appendKnowledgeLevel(level) {
					var name = scope.knowledge.name + level;
					return '<label class="btn btn-default" ng-click="knowledge.value=' + level + '">'
						 + '  <input type="radio" id="' + name + '" name="' + scope.knowledge.name + '" value="' + level + '"/> ' + level
						 + '</label>';
				}
				for (var level = 0; level < nLevels; level++) {
					htmlText += appendKnowledgeLevel(level);
				}
				htmlText += '</div>';
				element.html(htmlText);
			}
	    }
	}
})();
