'use strict';

describe('Directive: knowledgeLevels', function () {

  // load the directive's module
  beforeEach(module('clientApp'));

  var element,
    scope;

  beforeEach(inject(function ($rootScope) {
    scope = $rootScope.$new();
  }));

  it('should create knowledge-levels element', inject(function ($compile) {
    element = angular.element('<knowledge-levels></knowledge-levels>');
    element = $compile(element)(scope);
    expect(element.length).toBe(1);
  }));
});
